/*
 * generated by Xtext
 */
package org.xtext.example.lmrc.db2entity.ui.internal;

import static com.google.inject.util.Modules.override;
import static com.google.inject.Guice.createInjector;

import org.apache.log4j.Logger;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;

import java.util.concurrent.ExecutionException;

import org.eclipse.xtext.ui.shared.SharedStateModule;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class Db2EntityDslActivator extends AbstractUIPlugin {
	
	private static final Logger logger = Logger.getLogger(Db2EntityDslActivator.class);
	
	private Cache<String, Injector> injectors = CacheBuilder.newBuilder().build(new CacheLoader<String, Injector>() {
		@Override
		public Injector load(String language) throws Exception {
			Module runtimeModule = getRuntimeModule(language);
			Module sharedStateModule = getSharedStateModule();
			Module uiModule = getUiModule(language);
			Module mergedModule = override(override(runtimeModule).with(sharedStateModule)).with(uiModule);
			return createInjector(mergedModule);
		}
	});
	
	private static Db2EntityDslActivator INSTANCE;
	
	public static final String ORG_XTEXT_EXAMPLE_LMRC_DB2ENTITY_DB2ENTITYDSL = "org.xtext.example.lmrc.db2entity.Db2EntityDsl";
	
	public Injector getInjector(String languageName) {
		try {
			return injectors.get(languageName);
		} catch(ExecutionException e) {
			logger.error("Failed to create injector for " + languageName);
			logger.error(e.getMessage(), e);
			throw new RuntimeException("Failed to create injector for " + languageName, e);
		}
	}
	
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		INSTANCE = this;
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		injectors.invalidateAll();
		injectors.cleanUp();
		INSTANCE = null;
		super.stop(context);
	}
	
	public static Db2EntityDslActivator getInstance() {
		return INSTANCE;
	}
	
	protected Module getRuntimeModule(String grammar) {
		if (ORG_XTEXT_EXAMPLE_LMRC_DB2ENTITY_DB2ENTITYDSL.equals(grammar)) {
			return new org.xtext.example.lmrc.db2entity.Db2EntityDslRuntimeModule();
		}
		
		throw new IllegalArgumentException(grammar);
	}
	
	protected Module getUiModule(String grammar) {
		if (ORG_XTEXT_EXAMPLE_LMRC_DB2ENTITY_DB2ENTITYDSL.equals(grammar)) {
			return new org.xtext.example.lmrc.db2entity.ui.Db2EntityDslUiModule(this);
		}
		
		throw new IllegalArgumentException(grammar);
	}
	
	protected Module getSharedStateModule() {
		return new SharedStateModule();
	}
	
}