/*******************************************************************************
 * Copyright 2015 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.google.research.ic.ferret.test;

import com.google.research.ic.ferret.Config;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * TODO: Insert description here. (generated by marknewman)
 */
public class Debug {
  
  public static final String LOG_NAME = "qbdila";
  
  public static void log(String m) {
    if (Config.DEBUG) {
      Logger l = Logger.getLogger(LOG_NAME);
      l.info(m);
      l.setLevel(Level.INFO);
    }
  }
}