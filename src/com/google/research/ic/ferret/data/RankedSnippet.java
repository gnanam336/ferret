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
package com.google.research.ic.ferret.data;

/**
 * TODO: Insert description here. (generated by marknewman)
 */
public class RankedSnippet implements Comparable<RankedSnippet> {
  private Snippet snippet = null;
  private Float distance = -1.0f;
  /**
   * @param snippet
   * @param distance
   */
  public RankedSnippet(Snippet snippet, Float distance) {
    super();
    this.snippet = snippet;
    this.distance = distance;
  }
  /**
   * @return the snippet
   */
  public Snippet getSnippet() {
    return snippet;
  }
  /**
   * @param snippet the snippet to set
   */
  public void setSnippet(Snippet snippet) {
    this.snippet = snippet;
  }
  /**
   * @return the distance
   */
  public Float getDistance() {
    return distance;
  }
  /**
   * @param distance the distance to set
   */
  public void setDistance(Float distance) {
    this.distance = distance;
  }
  
  @Override
  public int compareTo(RankedSnippet other) {
    return Float.compare(distance, other.distance);
  }  
  
  @Override
  public String toString() {
    return snippet.toString() + "\nDISTANCE = " + distance;
  }
}
