package org.springframework.roo.addon.creator;

import java.io.File;
import java.util.Locale;

import org.springframework.roo.model.JavaPackage;

/**
 * Provides add-on creation operations.
 * 
 * @author Stefan Schmidt
 * @author Juan Carlos García
 */
public interface CreatorOperations {

  void createSimpleAddon(JavaPackage topLevelPackage, String description, String projectName,
      String folder);

  void createAdvancedAddon(JavaPackage topLevelPackage, String description, String projectName,
      String folder);

  void createRooAddonSuite(JavaPackage topLevelPackage, String description, String projectName);

  void createI18nAddon(JavaPackage topLevelPackage, String language, Locale locale,
      File messageBundle, File flagGraphic, String description, String projectName);

  void createWrapperAddon(JavaPackage topLevelPackage, String groupId, String artifactId,
      String version, String vendorName, String lincenseUrl, String docUrl, String osgiImports,
      String description, String projectName);

  boolean isAddonCreatePossible();


}
