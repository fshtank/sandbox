package com.fshtank.sanbox.service;

import com.fshtank.sanbox.model.SanboxWebRequest;
import com.fshtank.sanbox.model.SanboxWebResponse;

public interface SbxService {
    public SanboxWebResponse doSomething (SanboxWebRequest req);

    public SanboxWebResponse doShiftThing (SanboxWebRequest req);
}
