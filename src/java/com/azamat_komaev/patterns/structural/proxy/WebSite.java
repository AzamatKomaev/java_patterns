package com.azamat_komaev.patterns.structural.proxy;

public class WebSite implements Site {
    @Override
    public String loadPage() {
        return "<div>Page content</div>";
    }
}
