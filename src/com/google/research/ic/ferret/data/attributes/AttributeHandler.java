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
package com.google.research.ic.ferret.data.attributes;

import com.google.research.ic.ferret.data.ResultSet;
import com.google.research.ic.ferret.data.Snippet;

import java.util.List;

/**
 * TODO: Insert description here. (generated by marknewman)
 */
public interface AttributeHandler {

  /**
   * @param snippet
   */
  public void updateAttribute(Snippet snippet);

  public String getKey();  
  public String getKeyDisplayString(Attribute attribute);
  public String getValueDisplayString(Attribute attribute);
  
  public List<Bin> computeSummary(ResultSet set);   
  
}
