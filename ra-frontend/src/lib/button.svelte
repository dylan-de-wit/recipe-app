<script>
    export let text;
</script>

<div class={$$props.class}>
    <button on:click>{text}</button>
</div>

<style lang="scss">
  @import "../styles/theme";

  button {
    width: 10rem;
    padding: .5rem;
    background-color: $secondary-color;
    color: $bg-color;
    border-radius: .5rem;
    border: none;
  }
</style>