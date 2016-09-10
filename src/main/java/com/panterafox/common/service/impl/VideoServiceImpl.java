package com.panterafox.common.service.impl;

import com.panterafox.common.domain.VideoEntity;
import com.panterafox.common.repository.VideoRepository;
import com.panterafox.common.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Yaroslav on 10.09.2016.
 */
@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    private VideoRepository videoRepository;

    public VideoEntity add(VideoEntity entity) {
        return videoRepository.saveAndFlush(entity);
    }

    public void delete(int id) {
        videoRepository.delete(id);
    }

    public VideoEntity edit(VideoEntity entity) {
        return videoRepository.saveAndFlush(entity);
    }

    public List<VideoEntity> getAll() {
        return videoRepository.findAll();
    }
}
