/**
 *  Copyright 2016 SmartBear Software
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package io.swagger.sample.model;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "Tag")
public class Trace {
  public String asAt;
  public float height;
  public float latitude;
  public float longitude;    
  
  private long id;

  @XmlElement(name = "id")
  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  @XmlElement(name = "height")
  public float  getHeight() {
    return height;
  }

  public void setHeight(float height) {
    this.height = height;
  }

  @XmlElement(name = "latitude")
  public float  getLatitude() {
    return latitude;
  }

  public void setLatitude(float latitude) {
    this.latitude = latitude;
  }

  
  @XmlElement(name = "longitude")
  public float  getLongitude() {
    return latitude;
  }

  public void setLongitude(float longitude) {
    this.longitude = longitude;
  }

  
  @XmlElement(name = "asAt")
  public String  getAsAt() {
    return asAt;
  }

  public void setAsAt(String asAt) {
    this.asAt = asAt;
  }

  // Add remaining methods
  
}