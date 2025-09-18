package com.springboot.app.controllers;

import com.springboot.app.models.dto.ParamDto;
import com.springboot.app.models.dto.ParamMixDto;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/params")
public class RequestParamsController {

    @GetMapping("/foo")
    public ParamDto foo(@RequestParam(required = false, defaultValue = "Hola") String message) {
        ParamDto param = new ParamDto();
        param.setMessage(message);

        return param;
    }

    @GetMapping("/bar")
    public ParamMixDto bar(@RequestParam String text, @RequestParam Integer code) {

        ParamMixDto param = new ParamMixDto();
        param.setMessage(text);
        param.setCode(code);

        return param;
    }

    @GetMapping("/request")
    public ParamMixDto request(HttpServletRequest request) {
        int code = 10;
        try {
            code = Integer.parseInt(request.getParameter("code"));
        } catch (NumberFormatException e) {
        }
        ParamMixDto params = new ParamMixDto();

        params.setCode(code);
        params.setMessage(request.getParameter("message"));

        return params;
    }


}
