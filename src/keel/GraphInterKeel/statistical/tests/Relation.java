/***********************************************************************

	This file is part of KEEL-software, the Data Mining tool for regression, 
	classification, clustering, pattern mining and so on.

	Copyright (C) 2004-2010
	
	F. Herrera (herrera@decsai.ugr.es)
    L. Sánchez (luciano@uniovi.es)
    J. Alcalá-Fdez (jalcala@decsai.ugr.es)
    S. García (sglopez@ujaen.es)
    A. Fernández (alberto.fernandez@ujaen.es)
    J. Luengo (julianlm@decsai.ugr.es)

	This program is free software: you can redistribute it and/or modify
	it under the terms of the GNU General Public License as published by
	the Free Software Foundation, either version 3 of the License, or
	(at your option) any later version.

	This program is distributed in the hope that it will be useful,
	but WITHOUT ANY WARRANTY; without even the implied warranty of
	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
	GNU General Public License for more details.

	You should have received a copy of the GNU General Public License
	along with this program.  If not, see http://www.gnu.org/licenses/
  
**********************************************************************/


package keel.GraphInterKeel.statistical.tests;

/**
 * File: Relation.java
 * 
 * This class defines a relation between two integers.
 * 
 * @author Written by Joaquín Derrac (University of Granada) 29/04/2010
 * @version 1.1 
 * @since JDK1.5
*/
public class Relation {

    /**
     *first element
     */
    public int i; //first element

    /**
     * second element
     */
    public int j; //second element

  /**
  * Default builder
  */
  public Relation() {

  }//end-method

  /**
  * Builder
  *
  * @param x First integer
  * @param y Second integer
  */
  public Relation(int x, int y) {
    i = x;
    j = y;
  }//end-method
  
  /**
  * To string method
  *
  * @return A string representing the Relation
  */
  public String toString() {
	  return "("+i+","+j+")";	  
  }//end-method

}//end-class
