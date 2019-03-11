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

import io.swagger.annotations.*;

import java.util.List;
import java.util.ArrayList;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "Satellite")
public class Satellite {
  private long id; //TICK
  private String constellation; //TICK
  private String displayName;  //TICK
  //private OrbitType orbit;  // 
  private List<Trace> traces = new ArrayList<Trace>(); // Path and Trace combined //TICK
  private long prn; // TICK
  
  @XmlElement(name = "id")
  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }



  @XmlElement(name = "displayName")
  //@ApiModelProperty(value = "Satellite name")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String name) {
    this.displayName = name;
  }


  @XmlElement(name = "constellation")
  public String getConstellation() {
    return this.constellation;
  }

  public void setConstellation(String constellation) {
    this.constellation = constellation;
  }

  
  

  @XmlElementWrapper(name = "traces")
  @XmlElement(name = "trace")
  public List<Trace> getTraces() {
    return traces;
  }

  public void setTraces(List<Trace> traces) {
    this.traces = traces;
  }

  @XmlElement(name = "prn")
  public long getPrn() {
    return this.prn;
  }

  public void setPrn(long prn) {
    this.prn = prn;
  }

}
