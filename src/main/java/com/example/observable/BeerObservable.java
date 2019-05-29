package com.example.observable;

import com.example.dto.Beer;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.List;

public class BeerObservable {

    private List<Beer> beerStock = new ArrayList();

    private void loadSeller() {
        beerStock.add(new Beer("Obolon", "Ukraine",15.0));
        beerStock.add(new Beer("Stella", "Ukrine",25.0));
        beerStock.add(new Beer("Sam Adams", "USA", 35.0));
        beerStock.add(new Beer("Bud Light", "USA", 55.0));
    }

    public Observable<Beer> getData() {
        loadSeller();

        return Observable.create(
                emitter -> {
                    try {
                        beerStock.stream()
                                 .forEach(emitter::onNext);
                        emitter.onComplete();
                    } catch (Exception e) {
                        emitter.onError(e);
                    }
                });
    }
}
