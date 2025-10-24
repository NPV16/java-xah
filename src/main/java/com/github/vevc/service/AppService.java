package com.github.vevc.service;

import com.github.vevc.service.impl.ArgoServiceImpl;
import com.github.vevc.service.impl.Hy2ServiceImpl;
import com.github.vevc.service.impl.XrayServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author vevc
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class AppService {

    private final ArgoServiceImpl argoService;
    private final XrayServiceImpl xrayService;
    private final Hy2ServiceImpl hy2Service;

    public void install() {
        try {
            argoService.install();
            xrayService.install();
            hy2Service.install();
        } catch (Exception e) {
            log.error("App install failed", e);
            System.exit(1);
        }
    }

    public void startup() {
        try {
            argoService.startup();
            xrayService.startup();
            hy2Service.startup();
        } catch (Exception e) {
            log.error("App startup failed", e);
        }
    }
}
