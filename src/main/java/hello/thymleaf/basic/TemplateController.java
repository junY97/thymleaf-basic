package hello.thymleaf.basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author junyeong.jo .
 * @since 2023-07-18
 */
@Controller
@RequestMapping("template")
public class TemplateController {
    @GetMapping("/fragment")
    public String template() {
        return "template/fragment/fragmentMain";
    }

}
