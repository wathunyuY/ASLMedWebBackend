package com.med.common.utils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class StreamUtils {
	/**
	 * @author Teerapan V.
	 * @param List
	 *            of Object, distinct fields
	 * @return distinct List of Object by Input fields
	 */
	public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) {
		Map<Object, Boolean> seen = new ConcurrentHashMap<>();
		return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
	}

	public static <T, U, A, R> Collector<T, ?, R> flatMapping(Function<? super T, ? extends Stream<? extends U>> mapper,
			Collector<? super U, A, R> downstream) {

		BiConsumer<A, ? super U> acc = downstream.accumulator();
		return Collector.of(downstream.supplier(), (a, t) -> {
			try (Stream<? extends U> s = mapper.apply(t)) {
				if (s != null)
					s.forEachOrdered(u -> acc.accept(a, u));
			}
		}, downstream.combiner(), downstream.finisher(),
				downstream.characteristics().stream().toArray(Collector.Characteristics[]::new));
	}
}
