package com.shsxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

/**
 * @author 康晓伟
 * @date: 2018/10/11 17:28
 * @description: springMVC
 */
@Controller
public class FileController {

    @RequestMapping("file")
    public String file(HttpServletRequest request, Model model){

        //将request强转为MultipartHttpServletRequest
        MultipartHttpServletRequest mr=(MultipartHttpServletRequest)request;
        //读取前台上传文件  file为前台上传的变量名
        MultipartFile multipartFile= mr.getFile("file");
        //获取upload（上传资源位置）的路径
        String path=request.getSession().getServletContext().getRealPath("upload");

        if(null!=multipartFile&&!multipartFile.isEmpty()){
            //获取上传文件名
            String fileName=multipartFile.getOriginalFilename();
            try {
                //写到upload文件夹里
                multipartFile.transferTo(new File(path,fileName));

            } catch (Exception e) {
                model.addAttribute("msg","上传失败");
                e.printStackTrace();
            }
        }
        return "success";
    }
    public String upload(){
        return "file";
    }
}
