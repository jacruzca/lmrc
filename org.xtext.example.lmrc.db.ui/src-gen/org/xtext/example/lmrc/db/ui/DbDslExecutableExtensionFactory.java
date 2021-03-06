/*
 * generated by Xtext
 */
package org.xtext.example.lmrc.db.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.xtext.example.lmrc.db.ui.internal.DbDslActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class DbDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return DbDslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return DbDslActivator.getInstance().getInjector(DbDslActivator.ORG_XTEXT_EXAMPLE_LMRC_DB_DBDSL);
	}
	
}
