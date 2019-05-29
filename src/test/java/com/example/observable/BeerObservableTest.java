package com.example.observable;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNull.notNullValue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.example.dto.Beer;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.observers.TestObserver;
import io.reactivex.subscribers.TestSubscriber;

public class BeerObservableTest {

    @Test
    public void readBeer()  {
        // Given
        BeerObservable observable = new BeerObservable();

        //And
        TestObserver<Beer> subscriber = new TestObserver<>();

        //And
        Observable<Beer> beerObservable = observable.getData();

        // When
        beerObservable.subscribe(subscriber);

        // Then
        subscriber.assertSubscribed();
        subscriber.assertNoErrors();
        subscriber.assertValueCount(4);

    }
}
