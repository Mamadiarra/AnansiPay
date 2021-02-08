/*
 * Copyright 2021 Akanza
 * Licensed under the Server Side Public License (SSPL), VERSION 1, OCTOBER 16, 2018;
 */

package com.akanza.anansipay.core;

import java.util.List;

/**
 * <p>Interface describing the services offered by a payment platform.</p>
 *
 * @author Christian Amani 2021-02-07
 */
public interface PaymentService {

  /**
   * <p>Makes a payment to an account.</p>
   */
  void payment(Transaction transaction, Account account);

  /**
   * <p>Checks the status of a {@link Transaction} for an account.</p>
   */
  NotificationTransaction checkTransactionStatus(Transaction transaction, Account account);

  /**
   * <p>Retrieves {@link NotificationTransaction} from an account.</p>
   */
  List<NotificationTransaction> transactions(Account account);
}
