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