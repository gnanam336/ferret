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

import com.google.gson.Gson;
import com.google.research.ic.ferret.data.Snippet;
import com.google.research.ic.ferret.data.ext.alogger.AccessibilityLogEvent;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * TODO: Insert description here. (generated by marknewman)
 */
public class TestALogLoader {
  
  private static Gson gson = new Gson();

  public static AccessibilityLogEvent createEventFromFile(String dirName, String eventFileName) {
    AccessibilityLogEvent event = null;
    File file = new File(dirName, eventFileName);
    int linesRead = 0;
    try {
      FileReader fr = new FileReader(file);
      BufferedReader br = new BufferedReader(fr);
      String line = null;
      while ((line = br.readLine()) != null) {
        event = gson.fromJson(line, AccessibilityLogEvent.class);
        linesRead++;
      }
      br.close();      
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    assert(linesRead == 1);
    return event;
  }

  
  public static Snippet createSnippetFromFile(String dirName, String snippetFileName) {
    AccessibilityLogEvent event = null;
    Snippet snippet = null;
    File file = new File(dirName, snippetFileName);
    int linesRead = 0;
    try {
      FileReader fr = new FileReader(file);
      BufferedReader br = new BufferedReader(fr);
      String line = null;
      while ((line = br.readLine()) != null) {
        event = gson.fromJson(line, AccessibilityLogEvent.class);
        if (snippet == null) {
          snippet = new Snippet(event);
        } else {
          snippet.addEvent(event);
        }
        linesRead++;
      }
      br.close();      
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    assert(linesRead > 1);
    return snippet;
  }
}
