package io.spotnext.kawa.lang.runtime;

import com.oracle.truffle.api.object.ObjectType;

public class KawaObjectType extends ObjectType {
	protected static final int CACHE_LIMIT = 3;
	public static final ObjectType SINGLETON = new KawaObjectType();
}