package poly.edu.Lab1.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hcn")
public class hcnController {

    @Autowired
    private HttpServletRequest request;

    @GetMapping("/form")
    public String form(){
        return "hcn";
    }

    @PostMapping("/check")
    public String kiemtra(Model model){
        try {
            double width = Double.parseDouble(request.getParameter("width"));
            double length = Double.parseDouble(request.getParameter("length"));

            if(length<width){
                double temp = length;
                length = width;
                width = temp;
            }

//            if(length<width){
//                model.addAttribute("error", "Chiều dài phải lớn hơn chiều rộng!");
//                return "hcn";
//            }
            double area = width * length;
            double peri = (length + width) * 2;

            model.addAttribute("width", width);
            model.addAttribute("length", length);
            model.addAttribute("area", area);
            model.addAttribute("peri", peri);
        } catch (Exception e) {
            model.addAttribute("error", "Vui lòng nhập lại");
        }
        return "hcn";
    }
}
