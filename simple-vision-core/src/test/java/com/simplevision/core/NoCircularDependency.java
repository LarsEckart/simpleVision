package com.simplevision.core;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.ArchRule;
import org.junit.jupiter.api.Test;

class NoCircularDependency {

  public static final ArchRule rule = noClasses()
      .that().resideInAPackage("..core..")
      .should().dependOnClassesThat().resideInAnyPackage("..prescription..");

  @Test
  public void checkRule() {
    JavaClasses importedClasses = new ClassFileImporter().importPackages("com.simplevision");
    rule.check(importedClasses);
  }

}
