/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 * <p>
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 * <p>
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.relationship.playground.internal;

import com.liferay.journal.model.JournalArticle;
import com.liferay.journal.model.JournalFolder;
import com.liferay.journal.service.JournalArticleLocalService;
import com.liferay.relationship.Relationship;
import com.liferay.relationship.RelationshipResource;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Mate Thurzo
 */
@Component(
	immediate = true,
	property = "model.class.name=com.liferay.journal.model.JournalArticle",
	service = RelationshipResource.class
)
public class JournalArticleRelationshipResource
	implements RelationshipResource<JournalArticle> {

	@Override
	public Relationship<JournalArticle> relationship(
		Relationship.Builder<JournalArticle> builder) {

		return null;
//		return builder.modelSupplier(
//			id -> _journalArticleLocalService.fetchArticle(id)
//		).outboundSingleRelationship(
//			JournalFolder.class, JournalArticle::getFolder
//		).build();
	}

	@Reference
	private JournalArticleLocalService _journalArticleLocalService;

}
