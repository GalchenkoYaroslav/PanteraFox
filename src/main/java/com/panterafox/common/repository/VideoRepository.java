package com.panterafox.common.repository;

import com.panterafox.common.domain.VideoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by Yaroslav on 10.09.2016.
 */
public interface VideoRepository extends JpaRepository<VideoEntity, Integer> {

    @Query("select b from VideoEntity b where b.name = :name")
    VideoEntity getByName(@Param("name") String name);
}

