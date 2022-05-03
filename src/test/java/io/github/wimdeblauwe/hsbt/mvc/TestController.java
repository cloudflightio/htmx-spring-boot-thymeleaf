package io.github.wimdeblauwe.hsbt.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class TestController {

    @GetMapping("/without-trigger")
    @ResponseBody
    public String methodWithoutAnnotations() {
        return "";
    }

    @GetMapping("/with-trigger")
    @HxTrigger("eventTriggered")
    @ResponseBody
    public String methodWithHxTrigger() {
        return "";
    }

    @GetMapping("/with-trigger-settle")
    @HxTrigger(value = "eventTriggered", policy = HxTriggerPolicy.SETTLE)
    @ResponseBody
    public String methodWithHxTriggerAfterSettle() {
        return "";
    }

    @GetMapping("/with-trigger-swap")
    @HxTrigger(value = "eventTriggered", policy = HxTriggerPolicy.SWAP)
    @ResponseBody
    public String methodWithHxTriggerAfterSwap() {
        return "";
    }
}
