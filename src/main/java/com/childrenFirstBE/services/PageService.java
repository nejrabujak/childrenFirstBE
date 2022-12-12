package com.childrenFirstBE.services;

import com.childrenFirstBE.repositories.PageRepository;
import com.childrenFirstBE.models.Page;
import org.springframework.stereotype.Service;


@Service

public class PageService {
    private final PageRepository pageRepository;
    public PageService(PageRepository pageRepository) {
        this.pageRepository = pageRepository;
    }

    public Page create(Page model) {
        return pageRepository.save(model);
    }

}
