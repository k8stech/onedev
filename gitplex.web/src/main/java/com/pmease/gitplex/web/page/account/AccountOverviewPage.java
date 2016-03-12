package com.pmease.gitplex.web.page.account;

import org.apache.wicket.request.mapper.parameter.PageParameters;

import com.pmease.gitplex.web.page.organization.OrganizationOverviewPanel;
import com.pmease.gitplex.web.page.user.UserOverviewPanel;

@SuppressWarnings("serial")
public class AccountOverviewPage extends AccountLayoutPage {

	public AccountOverviewPage(PageParameters params) {
		super(params);
	}

	@Override
	protected void onInitialize() {
		super.onInitialize();
		
		if (getAccount().isOrganization())
			add(new OrganizationOverviewPanel("content", accountModel));
		else
			add(new UserOverviewPanel("content", accountModel));
	}

}
