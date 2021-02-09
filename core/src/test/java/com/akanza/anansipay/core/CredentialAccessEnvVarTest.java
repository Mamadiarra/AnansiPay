/*
 * Copyright 2021 Akanza
 * Licensed under the Server Side Public License (SSPL), VERSION 1, OCTOBER 16, 2018;
 */

package com.akanza.anansipay.core;

import com.github.stefanbirkner.systemlambda.SystemLambda;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author Christian Amani 2021-02-08
 */
class CredentialAccessEnvVarTest {

  final String usernameEnvironnementVar = "USERNAME_ENV_VAR";
  final String passwordEnvironnementVar = "PASSWORD_ENV_VAR";

  @Test
  @DisplayName("Test the extraction of environment variables, which are expressed as variables containing the value of the merchant's username")
  void username() throws Exception {
    // Given
    final var valueEnviVar = "USERNAME_MERCHANT";
    var credentialAccess = new CredentialAccessEnvVar(usernameEnvironnementVar,
        passwordEnvironnementVar);

    // When
    var optionalUsername = SystemLambda
        .withEnvironmentVariable(usernameEnvironnementVar, valueEnviVar)
        .execute(credentialAccess::username);

    // Then
    Assertions.assertTrue(optionalUsername.isPresent());
    var username = optionalUsername.get();
    Assertions.assertEquals(valueEnviVar, username);
  }

  @Test
  @DisplayName("Test the extraction of environment variables, which are expressed as variables containing the value of the merchant's password")
  void password() throws Exception {
    // Given
    final var valueEnviVar = "PASSWORD_MERCHANT";
    var credentialAccess = new CredentialAccessEnvVar(usernameEnvironnementVar,
        passwordEnvironnementVar);

    // When
    var optionalPassword = SystemLambda
        .withEnvironmentVariable(passwordEnvironnementVar, valueEnviVar)
        .execute(credentialAccess::password);

    // Then
    Assertions.assertTrue(optionalPassword.isPresent());
    var username = optionalPassword.get();
    Assertions.assertEquals(valueEnviVar, username);
  }
}
