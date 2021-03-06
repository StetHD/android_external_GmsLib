/*
 * Copyright 2013-2016 microG Project Team
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
 */

package com.google.android.gms.tasks;

import org.microg.gms.common.PublicApi;

import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * {@link Task} utility methods.
 */
@PublicApi
public final class Tasks {

    /**
     * Blocks until the specified Task is complete.
     *
     * @return the Task's result
     * @throws ExecutionException   if the Task fails
     * @throws InterruptedException if an interrupt occurs while waiting for the Task to complete
     * @throws TimeoutException     if the specified timeout is reached before the Task completes
     */
    public static <TResult> TResult await(Task<TResult> task, long timeout, TimeUnit unit) {
        // TODO
        return null;
    }

    /**
     * Blocks until the specified Task is complete.
     *
     * @return the Task's result
     * @throws ExecutionException   if the Task fails
     * @throws InterruptedException if an interrupt occurs while waiting for the Task to complete
     */
    public static <TResult> TResult await(Task<TResult> task) {
        // TODO
        return null;
    }

    /**
     * Returns a Task that will be completed with the result of the specified Callable.
     * <p/>
     * The Callable will be called on the main application thread.
     */
    public static <TResult> Task<TResult> call(Callable<TResult> callable) {
        // TODO
        return null;
    }

    /**
     * Returns a Task that will be completed with the result of the specified Callable.
     *
     * @param executor the Executor to use to call the Callable
     */
    public static <TResult> Task<TResult> call(Executor executor, Callable<TResult> callable) {
        // TODO
        return null;
    }

    /**
     * Returns a completed Task with the specified exception.
     */
    public static <TResult> Task<TResult> forException(Exception e) {
        // TODO
        return null;
    }

    /**
     * Returns a completed Task with the specified result.
     */
    public static <TResult> Task<TResult> forResult(TResult result) {
        // TODO
        return null;
    }

    /**
     * Returns a Task that completes successfully when all of the specified Tasks complete
     * successfully. Does not accept nulls.
     *
     * @throws NullPointerException if any of the provided Tasks are null
     */
    public static Task<Void> whenAll(Collection<? extends Task<?>> tasks) {
        // TODO
        return null;
    }

    /**
     * Returns a Task that completes successfully when all of the specified Tasks complete
     * successfully. Does not accept nulls.
     *
     * @throws NullPointerException if any of the provided Tasks are null
     */
    public static Task<Void> whenAll(Task<?>... tasks) {
        return whenAll(Arrays.asList(tasks));
    }
}
