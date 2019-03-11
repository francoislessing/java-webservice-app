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

package io.swagger.sample.data;


import io.swagger.sample.model.Satellite;
import io.swagger.sample.model.Trace;

import java.util.List;
import java.util.ArrayList;

public class SatelliteData {
  static List<Satellite> satellites = new ArrayList<Satellite>();
  //static List<Category> categories = new ArrayList<Category>();

  static {
//    categories.add(createCategory(1, "Dogs"));
//    categories.add(createCategory(2, "Cats"));
//    categories.add(createCategory(3, "Rabbits"));
//    categories.add(createCategory(4, "Lions"));

    satellites.add(createSatellite(1, "Sat1", "Const1", 
            new String[][] {{"11 March 2019","13","13","13"},    
                            {"11 March 2019","13","13","13"},
                            {"11 March 2019","14","14","14"},
                            }, 
            12));
    satellites.add(createSatellite(2, "Sat1", "Const1", 
            new String[][] {{"11 March 2019","13","13","13"},    
                            {"11 March 2019","13","13","13"},
                            {"11 March 2019","14","14","14"},
                            }, 
            12));
    satellites.add(createSatellite(3, "Sat1", "Const1", 
            new String[][] {{"11 March 2019","13","13","13"},    
                            {"11 March 2019","13","13","13"},
                            {"11 March 2019","14","14","14"},
                            }, 
            12));    
    satellites.add(createSatellite(4, "Sat1", "Const1", 
            new String[][] {{"11 March 2019","13","13","13"},    
                            {"11 March 2019","13","13","13"},
                            {"11 March 2019","14","14","14"},
                            }, 
            12));    
    satellites.add(createSatellite(5, "Sat1", "Const1", 
            new String[][] {{"11 March 2019","13","13","13"},    
                            {"11 March 2019","13","13","13"},
                            {"11 March 2019","14","14","14"},
                            }, 
            12));    
    satellites.add(createSatellite(6, "Sat1", "Const1", 
            new String[][] {{"11 March 2019","13","13","13"},    
                            {"11 March 2019","13","13","13"},
                            {"11 March 2019","14","14","14"},
                            }, 
            12));    
    satellites.add(createSatellite(7, "Sat1", "Const1", 
            new String[][] {{"11 March 2019","13","13","13"},    
                            {"11 March 2019","13","13","13"},
                            {"11 March 2019","14","14","14"},
                            }, 
            12));    
    satellites.add(createSatellite(8, "Sat1", "Const1", 
            new String[][] {{"11 March 2019","13","13","13"},    
                            {"11 March 2019","13","13","13"},
                            {"11 March 2019","14","14","14"},
                            }, 
            12));    
    satellites.add(createSatellite(9, "Sat1", "Const1", 
            new String[][] {{"11 March 2019","13","13","13"},    
                            {"11 March 2019","13","13","13"},
                            {"11 March 2019","14","14","14"},
                            }, 
            12));    
    satellites.add(createSatellite(10, "Sat1", "Const1", 
            new String[][] {{"11 March 2019","13","13","13"},    
                            {"11 March 2019","13","13","13"},
                            {"11 March 2019","14","14","14"},
                            }, 
            12));    
//    pets.add(createPet(2, categories.get(1), "Cat 2", new String[] {
//        "url1", "url2" }, new String[] { "tag2", "tag3" }, "available"));
//    pets.add(createPet(3, categories.get(1), "Cat 3", new String[] {
//        "url1", "url2" }, new String[] { "tag3", "tag4" }, "pending"));
//
//    pets.add(createPet(4, categories.get(0), "Dog 1", new String[] {
//        "url1", "url2" }, new String[] { "tag1", "tag2" }, "available"));
//    pets.add(createPet(5, categories.get(0), "Dog 2", new String[] {
//        "url1", "url2" }, new String[] { "tag2", "tag3" }, "sold"));
//    pets.add(createPet(6, categories.get(0), "Dog 3", new String[] {
//        "url1", "url2" }, new String[] { "tag3", "tag4" }, "pending"));
//
//    pets.add(createPet(7, categories.get(3), "Lion 1", new String[] {
//        "url1", "url2" }, new String[] { "tag1", "tag2" }, "available"));
//    pets.add(createPet(8, categories.get(3), "Lion 2", new String[] {
//        "url1", "url2" }, new String[] { "tag2", "tag3" }, "available"));
//    pets.add(createPet(9, categories.get(3), "Lion 3", new String[] {
//        "url1", "url2" }, new String[] { "tag3", "tag4" }, "available"));
//
//    pets.add(createPet(10, categories.get(2), "Rabbit 1", new String[] {
//        "url1", "url2" }, new String[] { "tag3", "tag4" }, "available"));
  }

  public Satellite getSatelliteById(long petId) {
    for (Satellite pet : satellites) {
      if (pet.getId() == petId) {
        return pet;
      }
    }
    return null;
  }

//  public List<Satellite> findSatelliteByStatus(String status) {
//    String[] statues = status.split(",");
//    List<Satellite> result = new java.util.ArrayList<Satellite>();
//    for (Satellite pet : satellites) {
//      for (String s : statues) {
//        if (s.equals(pet.getStatus())) {
//          result.add(pet);
//        }
//      }
//    }
//    return result;
//  }

//  public List<Satellite> findPetByTags(String tags) {
//    String[] tagList = tags.split(",");
//    List<Satellite> result = new java.util.ArrayList<Satellite>();
//    for (Satellite pet : satellites) {
//      if (null != pet.getTags()) {
//        for (Tag tag : pet.getTags()) {
//          for (String tagListString : tagList) {
//            if (tagListString.equals(tag.getName()))
//              result.add(pet);
//          }
//        }
//      }
//    }
//    return result;
//  }

  public void addSatellite(Satellite pet) {
    if (satellites.size() > 0) {
      for (int i = satellites.size() - 1; i >= 0; i--) {
        if (satellites.get(i).getId() == pet.getId()) {
          satellites.remove(i);
        }
      }
    }
    satellites.add(pet);
  }

  static Satellite createSatellite(
          long id, 
          String displayName,
          String constellation, 
          String[][] traces,
          long prn) {
    Satellite satellite = new Satellite();
    satellite.setId(id);  
    satellite.setDisplayName(displayName);
    satellite.setConstellation(constellation);
    satellite.setPrn(prn);

    List<Trace> traceObjs = new java.util.ArrayList<Trace>();
    int i = 0;
    if (null != traces) {
      for (String[] traceItem : traces) {
        i = i + 1;
        Trace tag = new Trace();
        tag.setId(i);
        tag.setAsAt(traceItem[0]);
        tag.setHeight(Float.parseFloat(traceItem[1]));
        tag.setLongitude(Float.parseFloat(traceItem[2]));
        tag.setLatitude(Float.parseFloat(traceItem[3]));
        traceObjs.add(tag);
      }
    }
    satellite.setTraces(traceObjs);
    
    return satellite;
  }

}