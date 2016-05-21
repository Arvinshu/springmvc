package com.arvin.controller;

import com.arvin.model.BlogEntity;
import com.arvin.model.UserEntity;
import com.arvin.repository.BlogRepository;
import com.arvin.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * Created by Arvin on 2016/5/11.
 */
@Controller
public class BlogController {
    @Autowired
    BlogRepository blogRepository;

    @Autowired
    UserRepository userRepository;

    //访问blog页面
    @RequestMapping(value = "/admin/blogs", method = RequestMethod.GET)
    public String showBlogs(ModelMap modelMap) {
        List<BlogEntity> blogList = blogRepository.findAll();

        modelMap.addAttribute("blogList", blogList);

        return "admin/blogs";
    }

    //添加博客
    @RequestMapping(value = "/admin/blogs/add", method = RequestMethod.GET)
    public String addBlog(ModelMap modelMap) {
        List<UserEntity> userList = userRepository.findAll();

        //jps注入用户表
        modelMap.addAttribute("userList", userList);

        return"admin/blogAdd";
    }

    //添加博客写库操作
    @RequestMapping(value = "admin/blogs/addP", method = RequestMethod.POST)
    public String addBlogPost(@ModelAttribute("blog") BlogEntity blogEntity) {

        //输出博客标题
        System.out.println(blogEntity.getTitle());

        //输出博客作者
        System.out.println(blogEntity.getUserByUserId().getNickname());

        //将修改后的信息写入数据库
        blogRepository.saveAndFlush(blogEntity);

        return "redirect:/admin/blogs";
    }

    //查看博文信息
    @RequestMapping(value = "/admin/blogs/show/{id}", method = RequestMethod.GET)
    public String showBlog(@PathVariable("id") int id, ModelMap modelMap) {

        BlogEntity blog = blogRepository.findOne(id);

        //将获取到的博文信息注入到admin/blogDetail页面
        modelMap.addAttribute("blog", blog);

        return("admin/blogDetail");
    }

    //修改博文的内容
    @RequestMapping(value = "/admin/blogs/update/{id}", method = RequestMethod.GET)
    public String updateBlog(@PathVariable("id") int id, ModelMap modelMap) {

        //创建一个BlogEntity类的实例，将查找的博文放在此实例中
        BlogEntity blog = blogRepository.findOne(id);

        List<UserEntity> userList = userRepository.findAll();

        modelMap.addAttribute("blog", blog);

        modelMap.addAttribute("userList", userList);

        return "admin/blogUpdate";
    }

    // 修改博客内容，POST请求
    @ExceptionHandler({SpringException.class})
    @RequestMapping(value = "/admin/blogs/updateP", method = RequestMethod.POST)
    public String updateBlogP(@ModelAttribute("blogP") BlogEntity blogEntity) {
        // 更新博客信息
        System.out.println(blogEntity.getTitle());

        if(blogEntity.getContent().length() > 5000) {
            throw new SpringException("博文长度有误");
        }else {
            blogRepository.updateBlog(blogEntity.getTitle(), blogEntity.getUserByUserId().getId(),
                    blogEntity.getContent(), blogEntity.getPubDate(), blogEntity.getId());
            blogRepository.flush();
        }

        return "redirect:/admin/blogs";
    }

    // 删除博客文章
    @RequestMapping("/admin/blogs/delete/{id}")
    public String deleteBlog(@PathVariable("id") int id) {
        blogRepository.delete(id);
        blogRepository.flush();
        return "redirect:/admin/blogs";
    }

    @RequestMapping(value = "/admin/blogs/returnB", method = RequestMethod.GET)
    public String returnUser() {
        // 重定向到用户管理页面，方法为 redirect:url
        return "redirect:/admin/blogs";
    }
}
