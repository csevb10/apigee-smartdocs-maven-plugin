/*
 * Copyright 2017 bill.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.apigee.smartdocs.config.utils;

/**
 *
 * @author bill
 */
public class PortalField {
  private String path;
  private String field;

  public void setPath( String pathName ) {
    this.path = pathName;
  }

  public String getPath( ) {
    return this.path;
  }

  public void setField( String fieldName ) {
    this.field = fieldName;
  }

  public String getField( ) {
    return this.field;
  }


  @Override
  public String toString() { return path.toString(); } // to test
}
