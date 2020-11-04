package com.fshtank.sanbox.controller;

import com.fshtank.sanbox.exception.SanboxException;
import com.fshtank.sanbox.model.SanboxWebRequest;
import com.fshtank.sanbox.model.SanboxWebResponse;
import com.fshtank.sanbox.service.SbxService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;


/**
 * Example REST resource controller.
 *
 * @author Rick Fisher (richard.fisher@gm.com)
 */
@RestController
@RequestMapping("/sandbox")
public class SanboxController extends BaseController {

    private static final Logger logger = LoggerFactory.getLogger(SanboxController.class);
    @Autowired
    SbxService sbxService;
    @Autowired
    private SanboxWebRequest sanboxWebRequest;

    /**
     * @return Collection of Collection<PbcOfertaVeiculo>
     */
    @RequestMapping(value = "/demo/{locale}/{language}",
            method = RequestMethod.GET,
            produces = {"application/vnd.status.v1+json;version=1.0",
                    "application/vnd.status.v1+xml;version=1.0"}
    )
    public SanboxWebResponse getDemo(@PathVariable("locale") String locale,
                                     @PathVariable("language") String language,
                                     @RequestParam(value = "sampleId", required = false) Integer sampleId) {

        sanboxWebRequest.setLocale(locale);
        sanboxWebRequest.setLanguage(language);
        sanboxWebRequest.setSampleId(sampleId);

        SanboxWebResponse sanboxWebResponse = sbxService.doSomething(sanboxWebRequest);

        return sanboxWebResponse;
    }




    @RequestMapping(value = "alive",
            method = RequestMethod.GET,
            produces = {"application/vnd.currentoffers.v2+json;version=2.0",
                    "application/vnd.currentoffers.v2+xml;version=2.0"}
    )

    public String imAlive () { return "Pearl Jam: 'Im Alive!'";
    }

}
