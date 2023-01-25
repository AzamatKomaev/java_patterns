package com.azamat_komaev.patterns.structural.proxy;

public class Main {
    public static void main(String[] args) {
        Site website = new WebSite();
        Site websiteProxy = new WebSiteProxy(website);
        System.out.println(websiteProxy.loadPage());
    }
}
