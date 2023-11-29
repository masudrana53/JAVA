import { NgModule } from '@angular/core';
import { BrowserModule, provideClientHydration } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { StoreComponent } from './store/store.component';
import { ProductRepository } from './model/product.repository';
import { StaticDataSource } from './model/static.datasource';
import { StoreModule } from './store/store.module';
import { StoreFirstGuard } from "./storeFirst.guard";
import { RouterModule } from '@angular/router';
import { CheckoutComponent } from './store/checkout.component';
import { CartDetailComponent } from './store/cartDetail.component';

@NgModule({
  declarations: [
    AppComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    StoreModule,
    RouterModule.forRoot([
      {
      path: "store", component: StoreComponent,
      canActivate: [StoreFirstGuard]
      },
      {
      path: "cart", component: CartDetailComponent,
      canActivate: [StoreFirstGuard]
      },
      {
      path: "checkout", component: CheckoutComponent,
      canActivate: [StoreFirstGuard]
      },
      { path: "**", redirectTo: "/store" }
      ])],
  
  providers: [
    provideClientHydration(),
    ProductRepository,
    StaticDataSource,
    StoreFirstGuard
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
