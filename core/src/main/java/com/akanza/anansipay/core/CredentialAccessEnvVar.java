/*
 * Copyright 2021 Akanza
 * Licensed under the Server Side Public License (SSPL), VERSION 1, OCTOBER 16, 2018;
 */

package com.akanza.anansipay.core;

import java.util.Optional;

/**
 * <p>Class for retrieving the references of an account from the environment variables.</p>
 *
 * @author Christian Amani 2021-02-08
 */
public class CredentialAccessEnvVar implements CredentialAccess {

  private final String usernameEnvironmentVariable;
  private final String passwordEnvironnementVariable;

  public CredentialAccessEnvVar(String usernameEnvironmentVariable,
      String passwordEnvironnementVariable) {
    this.usernameEnvironmentVariable = usernameEnvironmentVariable;
    this.passwordEnvironnementVariable = passwordEnvironnementVariable;
  }

  @Override
  public Optional<String> username() {
    var username = System.getenv(this.usernameEnvironmentVariable);
    return Optional.ofNullable(username);
  }

  @Override
  public Optional<String> password() {
    var password = System.getenv(this.passwordEnvironnementVariable);
    return Optional.ofNullable(password);
  }
}
