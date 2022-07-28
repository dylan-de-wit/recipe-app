<div class="{$$props.class}  button">
    <button on:click>
        <slot>Button</slot>
    </button>
</div>

<style lang="scss">
  @import "../styles/theme";

  button {
    width: 10rem;
    padding: .75em;
    background: transparent;
    border: 2px solid $primary-color;
    border-radius: 2.5rem;
    outline: none;
    cursor: pointer;
    color: $primary-color;
    text-align: center;
    text-transform: capitalize;
    font-weight: bold;
    letter-spacing: 1px;
    transition: all 0.25s ease;

    &:hover {
      background: $primary-color;
      color: white;
    }

    &:active {
      letter-spacing: 2px;
    }
  }
</style>