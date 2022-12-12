package com.childrenFirstBE.controllers;

import com.childrenFirstBE.services.PageService;
import com.childrenFirstBE.models.Page;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/page")

public class PageController {
    private final PageService pageService;

    public PageController(PageService pageService) {
        this.pageService = pageService;
    }

    @CrossOrigin
    @PostMapping
    public Page createPage(@RequestBody Page page) {
        return pageService.create(page);
    }
}
