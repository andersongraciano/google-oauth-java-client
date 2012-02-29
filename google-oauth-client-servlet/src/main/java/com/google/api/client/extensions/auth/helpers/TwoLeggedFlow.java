/*
 * Copyright (c) 2011 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.api.client.extensions.auth.helpers;

import java.io.IOException;

import javax.jdo.PersistenceManager;

/**
 * A two legged flow is able to create credentials without intervention from the user. It will
 * manage the persistence of credentials as well as be able to mint them when they do not exist.
 *
 * @author moshenko@google.com (Jake Moshenko)
 *
 * @since 1.5
 * @deprecated (scheduled to be removed in 1.8) Use
 *   {@code com.google.api.client.googleapis.extensions.appengine.auth.oauth2.AppIdentityCredential}
 *   from {@code google-api-java-client}
 */
@Deprecated
public interface TwoLeggedFlow {
  /**
   * Load the instance of {@link Credential} associated with this flow instance or create a new one
   * if one can not be loaded.
   *
   * @param pm Persistence manager used for communicating with the datastore.
   * @return {@link Credential} instance associated with this flow instance.
   * @throws IOException Thrown when a failure occurs communicating with the auth server or the data
   *         store.
   */
  Credential loadOrCreateCredential(PersistenceManager pm) throws IOException;
}
