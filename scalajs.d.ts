declare module "scalajs:main.js" {
  export interface Main {
    run(worker: Worker): void;
  }

  export const Main: Main;
} 

declare module "out/www/fastLinkJS.dest/main.js" {
  export interface Main {
    run(worker: Worker): void;
  }

  export const Main: Main;
}
