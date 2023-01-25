package com.azamat_komaev.patterns.structural.proxy;

public class WebSiteProxy implements Site {
    private Site site;
    private String siteCache;

    public WebSiteProxy(Site site) {
        this.site = site;
    }

    @Override
    public String loadPage() {
        if (siteCache == null) {
            siteCache = site.loadPage();
        }
        return siteCache;
    }
}
