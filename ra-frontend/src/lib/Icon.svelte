<script lang="ts">
    export let size: 's' | 'm' | 'l' = 's';
    export let icon;
</script>

<figure class="{$$props.class}" on:click>
    {#if icon}
        <img class="icon--{size}" src="{icon}" alt="icon">
    {:else}
        <img class="icon--{size}" src="https://cdn-icons-png.flaticon.com/512/8074/8074889.png" alt="icon">
    {/if}
</figure>

<style lang="scss">
  figure {
    margin: 0;
  }

  .icon {
    &--s {
      max-width: 2rem;
    }

    &--m {
      max-width: 3rem;
    }

    &--l {
      max-width: 4rem;
    }
  }
</style>