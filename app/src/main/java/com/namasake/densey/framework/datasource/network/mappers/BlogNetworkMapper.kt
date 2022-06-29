package com.namasake.densey.framework.datasource.network.mappers

import com.namasake.densey.business.domain.model.Blog
import com.namasake.densey.business.domain.util.EntityMapper
import com.namasake.densey.framework.datasource.network.model.BlogNetworkEntity
import javax.inject.Inject

class BlogNetworkMapper @Inject constructor() : EntityMapper<BlogNetworkEntity,Blog> {
    override fun mapFromEntity(entity: BlogNetworkEntity): Blog {
        return Blog(
            title = entity.title,
            imageUrl = entity.imageUrl,
            blogUrl = entity.blogUrl,
            description = entity.description,
            mediaId = entity.mediaId
        )
    }

    override fun mapToEntity(domainModel: Blog): BlogNetworkEntity {
        return BlogNetworkEntity(
            title = domainModel.title,
            imageUrl = domainModel.imageUrl,
            blogUrl = domainModel.blogUrl,
            description = domainModel.description,
            mediaId = domainModel.mediaId
        )
    }
}