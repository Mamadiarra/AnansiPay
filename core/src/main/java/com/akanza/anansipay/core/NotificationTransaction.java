/*
 * Copyright 2021 Akanza
 * Licensed under the Server Side Public License (SSPL), VERSION 1, OCTOBER 16, 2018;
 */

package com.akanza.anansipay.core;

import java.time.LocalDateTime;

/**
 * <p>Interface representing an organisation's response to the processing of a transaction.</p>
 *
 * @author Christian Amani 2021-02-07
 */
public interface NotificationTransaction extends Transaction {

  /**
   * @return Transaction status
   */
  String status();

  /**
   * @return Date of creation of the transaction notification
   */
  LocalDateTime createdDate();

  /**
   * @return Date of update of the transaction notification
   */
  LocalDateTime updatedDate();

  /**
   * @return Date of cancel of the transaction notification
   */
  LocalDateTime canceledDate();
}
