/**
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 * 
 * Copyright 2009 lexst.com, All rights reserved
 * 
 * this file is part of lexst
 * 
 * visit interface basic class
 * 
 * @author scott.liang lexst@126.com
 * 
 * @version 1.0 2/2/2009
 * @see com.lexst.visit
 * @license GNU Lesser General Public License (LGPL)
 */
package com.lexst.visit;

public interface Visit {

	/**
	 * ping RPC server, keep connection
	 * @throws VisitException
	 */
	void nothing() throws VisitException;

}