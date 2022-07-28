<script lang="ts">
    export let text;
    export let size: 'h1' | 'h2' | 'h3' | 'h4' = 'h2';
</script>

{#if size === 'h1'}<h1>{text}</h1>{/if}
{#if size === 'h2'}<h2>{text}</h2>{/if}
{#if size === 'h3'}<h3>{text}</h3>{/if}
{#if size === 'h4'}<h4>{text}</h4>{/if}

<style lang="scss">
  @import "../../styles/theme";

  h2 {
    margin: 0;
    color: $secondary-color;
  }
</style>