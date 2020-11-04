package com.fshtank.sanbox.service.impl;

import com.fshtank.sanbox.model.SanboxWebResponse;
import com.fshtank.sanbox.model.SanboxWebRequest;
import com.fshtank.sanbox.service.SbxService;

import java.nio.charset.Charset;
import java.util.Random;

public class SbxServiceImpl implements SbxService {

    @Override
    public SanboxWebResponse doSomething(SanboxWebRequest req) {

        var resp = new SanboxWebResponse();

        resp.setLanguage(req.getLanguage());
        resp.setLocale(req.getLocale());
        resp.setSampleId(req.getSampleId());

        resp.setRandomValue(generateRandomString());

        return resp;
    }

    /**
     * Generate some random string to fill the last response value randomValue
     * @return
     */
    private String generateRandomString() {
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));

        return generatedString;

    }
}
