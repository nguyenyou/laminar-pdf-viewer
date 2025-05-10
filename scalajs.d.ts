declare module "scalajs:main.js" {
  export interface Main {
    run(worker: Worker): void;
  }

  export const Main: Main;
} 