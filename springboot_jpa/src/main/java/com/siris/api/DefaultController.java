package com.siris.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import springfox.documentation.annotations.ApiIgnore;

/**
 * 클래스에 대한 설명을 여기에 쓴다.
 * 
 * @author 	sjcNotBooki
 * @since 	2019. 11. 25.
 * @version 1.0
 * @see <pre>
 *  == 개정이력(Modification Information) ==
 *   
 *   수정일			수정자				수정내용
 *  ---------------------------------------------------------------------------------
 *   2019. 11. 25.		sjcNotBooki				최초생성
 * 
 * </pre>
 */

@ApiIgnore
@Controller
public class DefaultController {
	@RequestMapping("/")
    public String home() {
        return "redirect:swagger-ui.html";
    }
}

