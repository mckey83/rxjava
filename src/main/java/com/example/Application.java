package com.example;


import com.example.dto.Beer;
import com.example.observable.BeerObservable;
import io.reactivex.Observable;


public class Application {
    public static void main(String[] args) {

        Observable<Beer> beerData = new BeerObservable().getData();

        beerData.subscribe(
                s -> System.out.println(s),
                error -> System.out.println("error: " + error),
                () -> System.out.println("complete")
        );
    }
}
